from fastapi import FastAPI
import json
from pydantic import BaseModel


class LoginInfo(BaseModel):
    username: str
    password: int


class Token(BaseModel):
    value: str


class RegistrationInfo(BaseModel):
    username: str
    password: str


app = FastAPI()


@app.get("/mock/receipts/list")
def get_all_receipts():
    with open('/mock-files/mock-receipts-list.json') as file:
        data = json.load(file)
        return data


@app.get("/mock/receipt")
def get_receipt_by_id(id: int = 1):
    with open('/mock-files/mock-receipt.json') as file:
        if id not in [1, 2, 3]:
            return 'error'
        data = json.load(file)
        return data[id]


authToken = "token"


@app.post('/login')
def try_login(request_login_info: LoginInfo):
    login_info = LoginInfo('user', 'password')
    if login_info.username == request_login_info.username:
        return login_info.password
    else:
        return 'error'


@app.post('/updateToken')
def update_token(token: Token):
    authToken = token.value
    return 'ok'


@app.post('/authenticate')
def authenticate(token: Token):
    if token.value == authToken:
        return LoginInfo('user', 'password')
    else:
        return LoginInfo('error', 'error')


@app.post('/register')
def authenticate(registration_info: RegistrationInfo):
    if registration_info.username != 'user':
        return 'ok'
    else:
        return 'error'
