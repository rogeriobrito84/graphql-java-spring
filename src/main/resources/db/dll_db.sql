
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);
alter table product add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    create table client_model (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table product_model (
       id bigint not null auto_increment,
        email varchar(255),
        price decimal(19,2),
        primary key (id)
    ) engine=InnoDB;

    create table purchase_model (
       id bigint not null auto_increment,
        data date,
        quantity integer,
        status varchar(255),
        client_id bigint,
        product_id bigint,
        primary key (id)
    ) engine=InnoDB;

    alter table purchase_model 
       add constraint FKjgido9alfa611kntcnw6xdru7 
       foreign key (client_id) 
       references client_model (id);

    alter table purchase_model 
       add constraint FKr333dli5y0s0fej438cqeyxhj 
       foreign key (product_id) 
       references product_model (id);

    create table client_model (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table product_model (
       id bigint not null auto_increment,
        email varchar(255),
        price decimal(19,2),
        primary key (id)
    ) engine=InnoDB;

    create table purchase_model (
       id bigint not null auto_increment,
        data date,
        quantity integer,
        status varchar(255),
        client_id bigint,
        product_id bigint,
        primary key (id)
    ) engine=InnoDB;

    alter table purchase_model 
       add constraint FKjgido9alfa611kntcnw6xdru7 
       foreign key (client_id) 
       references client_model (id);

    alter table purchase_model 
       add constraint FKr333dli5y0s0fej438cqeyxhj 
       foreign key (product_id) 
       references product_model (id);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);

    alter table product 
       add column email varchar(255);
