FROM ubuntu:latest

RUN apt -y update && \
	apt -y upgrade && \ 
	apt install -y sqlite3 libsqlite3-dev nano && \
	mkdir /homework && \
	mkdir /homework/results
ADD ./sql/mentees.sql /homework
