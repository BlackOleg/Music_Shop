    create table buckets (
        id bigint not null,
        user_id bigint unique,
        primary key (id)
    );

    create table buckets_songs (
        bucket_id bigint not null,
        song_id bigint not null
    );
 
    create table genres (
        id bigint not null,
        title varchar(255),
        primary key (id)
    );

    create table order_details (
        amount numeric(38,2),
        price numeric(38,2),
        id bigint not null,
        order_id bigint,
        song_id bigint,
        primary key (id)
    );

    create table orders (
        sum numeric(38,2),
        created timestamp(6),
        id bigint not null,
        updated timestamp(6),
        user_id bigint,
        address varchar(255),
        status varchar(255) check (status in ('NEW','APPROVED','CANCELED','PAID','CLOSED')),
        primary key (id)
    );

    create table orders_details (
        details_id bigint not null unique,
        order_id bigint not null
    );

    create table songs (
        nds numeric(38,2),
        price numeric(38,2),
        sales numeric(38,2),
        id bigint not null,
        album varchar(255),
        cantor varchar(255),
        orquesta varchar(255) not null,
        title varchar(255) not null,
        year varchar(255),
        primary key (id)
    );

    create table songs_genres (
        genre_id bigint not null,
        song_id bigint not null
    );

    create table users (
        archive boolean,
        bucket_id bigint unique,
        id bigint not null,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        role varchar(255) check (role in ('CLIENT','MANAGER','ADMIN')),
        primary key (id)
    );


    alter table if exists buckets 
       add constraint  c_buckets_user_id
       foreign key (user_id) 
       references users;

    alter table if exists buckets_songs 
       add constraint c_buckets_songs_song_id 
       foreign key (song_id) 
       references songs;

    alter table if exists buckets_songs 
       add constraint c_buckets_songs_bucket_id 
       foreign key (bucket_id) 
       references buckets;

    alter table if exists order_details 
       add constraint c_order_details_order_id
       foreign key (order_id) 
       references orders;

    alter table if exists order_details 
       add constraint c_order_details_song_id
       foreign key (song_id) 
       references songs;

    alter table if exists orders 
       add constraint c_orders_user_id
       foreign key (user_id) 
       references users;

    alter table if exists orders_details 
       add constraint c_orders_details_details_id
       foreign key (details_id) 
       references order_details;

    alter table if exists orders_details 
       add constraint c_orders_details_order_id
       foreign key (order_id) 
       references orders;

    alter table if exists songs_genres 
       add constraint c_songs_genres_genre_id
       foreign key (genre_id) 
       references genres;

    alter table if exists songs_genres 
       add constraint c_songs_genres_song_id
       foreign key (song_id) 
       references songs;

    alter table if exists users 
       add constraint c_users_bucket_id
       foreign key (bucket_id) 
       references buckets;


        create sequence bucket_seq start with 1 increment by 1;

        create sequence genre_seq start with 1 increment by 1;

        create sequence order_details_seq start with 1 increment by 1;

        create sequence order_seq start with 1 increment by 1;

        create sequence song_seq start with 1 increment by 1;

        create sequence user_seq start with 1 increment by 1;
