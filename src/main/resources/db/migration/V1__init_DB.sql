    drop table if exists categorys;
    drop table if exists images;
    drop table if exists products;

    create table categorys (
        id bigint not null auto_increment,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table images (
        id bigint not null auto_increment,
        product_id bigint,
        download_url varchar(255),
        file_name varchar(255),
        file_type varchar(255),
        image longblob,
        primary key (id)
    ) engine=InnoDB;

    create table products (
        inventory integer,
        price decimal(38,2),
        category_id bigint,
        id bigint not null auto_increment,
        brand varchar(255),
        description varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    alter table images
       add constraint product_id_constraint
       foreign key (product_id)
       references products (id);

    alter table products
       add constraint category_id_constraint
       foreign key (category_id)
       references categorys (id);