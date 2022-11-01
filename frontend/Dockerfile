FROM node:19.0.0-alpine as node

WORKDIR /app

COPY ./ ./

RUN npm install

RUN npm run build

FROM node:19.0.0-alpine

EXPOSE 3000

WORKDIR /app

COPY --from=node /app/build/ ./build/
COPY --from=node /app/package.json ./package.json
COPY --from=node /app/node_modules ./node_modules

CMD ["node", "./build/index.js"]
