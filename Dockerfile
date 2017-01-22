FROM openjdk:8

RUN mkdir -p /usr/src/hello-bot
RUN mkdir -p /usr/app

COPY build/distributions/* /usr/src/hello-bot/

RUN unzip /usr/src/hello-bot/hello-bot-*.zip -d /usr/app/
RUN ln -s /usr/app/hello-bot-* /usr/app/hello-bot

WORKDIR /usr/app/hello-bot

ENTRYPOINT ["./bin/hello-bot"]
CMD []
