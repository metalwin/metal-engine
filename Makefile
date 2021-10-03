start-db:
	docker run -d \
	--name metalwin-db \
	-e POSTGRES_USER=metalwin \
	-e POSTGRES_PASSWORD=metalwin \
	-e POSTGRES_DB=metalwin \
	-p 5432:5432 \
	postgres:11

stop-db:
	docker stop metalwin-db
	docker rm metalwin-db
