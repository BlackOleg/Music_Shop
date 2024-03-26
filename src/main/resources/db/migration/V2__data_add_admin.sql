INSERT INTO users (id, archive, email, name, password, role, bucket_id)
VALUES (1, false, 'black@bk.ru', 'major', 'coolmajor', 'ADMIN',NULL);
ALTER SEQUENCE user_seq RESTART with 2;