# cost-accountant

## Prerequisites

- npm

```bash
curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
source ~/.bashrc
nvm install node
```

## Developing

```bash
npm install
npm run prepare

npm run dev

# or start the server and open the app in a new browser tab
npm run dev -- --open
```

## Building

To create a production version of your app:

```bash
npm run build

node build/index.js
```

## Docker

To build:

```bash
docker build -t cost-accountant-front .
```

To run:

```bash
docker run -d -p 3000:3000 --rm --name cost-accountant-front cost-accountant-front
```

## Troubleshooting

To run exposing in local network, run

```bash
npm run dev -- --host --port 3333
```
