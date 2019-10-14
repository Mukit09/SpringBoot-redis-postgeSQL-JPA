# SpringBoot-redis-postgeSQL-JPA
## A spring boot app to run redis cache with JPA and postgeSQL
==============================================================

### Installation:

> - Redis Server ([Download from redis official site][2])
> - PostgreSQL ([Download from postgreSQL official site][1]) 

After installing redis set the password. To set password open the command prompt. 
Type: 
> redis-cli

Then type:
> config set requirepass "yourPassword"

Now it will not possible to give any redis command unless you authenticate. To authentiacate with the password, type:
> AUTH "yourPassword"

Now it can be possible again to give redis command. Like, 
> 127.0.0.1:6379> config get requirepass
> 1) "requirepass"
> 2) "yourPassword

postgreSQL installation is an easy one. Just follow the traditional steps.



[1]: https://www.postgresql.org/download/
[2]: https://redis.io/download
