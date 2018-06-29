FROM node:10-alpine AS build

RUN apk add --no-cache chromium libsass

WORKDIR /usr/src/app

COPY package.json .
COPY package-lock.json .

RUN npm install -g @angular/cli && npm install

# add app
COPY . /usr/src/app

RUN ng build --prod

FROM nginx:alpine AS production

COPY --from=build /usr/src/app/dist/hsis-ui/ /usr/share/nginx/html
