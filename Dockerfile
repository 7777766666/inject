# Используйте образ PostgreSQL
FROM postgres

# Установите переменные окружения
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD root
ENV POSTGRES_DB postgres

# Установите порт PostgreSQL
EXPOSE 5432

# Установите pgAdmin 4
RUN apt-get update && apt-get install -y wget ca-certificates
RUN wget --quiet https://ftp.postgresql.org/pub/pgadmin/pgadmin4/v4.30/pip/pgadmin4-4.30-py3-none-any.whl
RUN pip install pgadmin4-4.30-py3-none-any.whl

# Установите переменные окружения pgAdmin
ENV PGADMIN_DEFAULT_EMAIL goszakupki.aktiv@gmail.com
ENV PGADMIN_DEFAULT_PASSWORD 1

# Установите порт pgAdmin
EXPOSE 80

# Запустите PostgreSQL и pgAdmin при запуске контейнера
CMD service postgresql start && python /usr/local/lib/python3.7/site-packages/pgadmin4/pgAdmin4.py
