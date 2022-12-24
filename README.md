# Cost accountant

This is an app designed to help keep track of your purchases.

## Motivation

To better manage my expenses, I want to somehow keep track of 
that goods I buy. Also, I often buy something, which I then want to
split with someone else. To automate this, I created a service,
which parses receipt json obtained from official tax app.

## Future plans

Currently, only basic feature present: you upload json, and
split the receipt accordingly.

I want to not only calculate shares, but store this data, 
and create statistics dashboard from it. Also, I want to create user
accounts, to enhance statistics feature: this way purchases from
other people receipts can be added in your statistics.

Also, I want to add manual receipt creation: sometimes qr on receipt
is broken, or the receipt is lost or didn't exist.

## Getting started

### Prerequisites

- Docker
- docker-compose

### Run services with docker-compose

```bash
docker-compose up
```

