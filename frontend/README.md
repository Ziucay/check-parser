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

npm run dev

# or start the server and open the app in a new browser tab
npm run dev -- --open
```

## Building

To create a production version of your app:

```bash
npm run build
```

You can preview the production build with `npm run preview`.

> To deploy your app, you may need to install an [adapter](https://kit.svelte.dev/docs/adapters) for your target environment.

## Troubleshooting

To run exposing in local network, run

```bash
npm run dev -- --host --port 3333
```
