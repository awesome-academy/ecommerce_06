create table role
(
  Role_id   tinyint auto_increment
    primary key,
  Role_name char(10) null
);

create table account
(
  id           tinyint auto_increment
    primary key,
  Email        char(30) null,
  PassWord     char(20) null,
  Role_Id      tinyint  not null,
  Phone_Number char(15) null,
  constraint account_ibfk_1
    foreign key (Role_Id) references role (Role_id)
);

create index Role_Id
  on account (Role_Id);

create table orders
(
  Id                   int unsigned auto_increment
    primary key,
  Customer_Name        varchar(50) charset utf8 not null,
  Customer_Adress      varchar(50) charset utf8 not null,
  Customer_PhoneNumber char(15)                 not null,
  Customer_Note        text                     null,
  Status               varchar(30)              not null,
  Created_At           datetime                 not null,
  Updated_At           datetime                 null,
  User_id              tinyint                  null,
  Shipper_id           tinyint                  null,
  constraint orders_ibfk_3
    foreign key (User_id) references account (id),
  constraint orders_ibfk_4
    foreign key (Shipper_id) references account (id)
);

create index Account_id
  on orders (User_id);

create index Shipper_id
  on orders (Shipper_id);

create table suppliers
(
  Id          smallint(5) unsigned auto_increment
    primary key,
  Name        varchar(50) charset utf8 not null,
  adress      varchar(50) charset utf8 not null,
  PhoneNumber char(15)                 null
)
  comment 'Nhà cung cấp';

create table products
(
  id          smallint(5) unsigned auto_increment
    primary key,
  Name        varchar(50) charset utf8 not null,
  Price       decimal                  not null,
  MainPhoto   varchar(50) charset utf8 not null,
  Supplier_Id smallint(5) unsigned     null,
  constraint products_ibfk_1
    foreign key (Supplier_Id) references suppliers (Id)
);

create table Product_Details
(
  Product_ID           smallint(5) unsigned     not null,
  Motor                smallint(5) unsigned     null,
  Operate              varchar(50) charset utf8 null,
  Speed                float unsigned           null,
  Safe_Weight          smallint(5) unsigned     null,
  Weight               smallint(5) unsigned     null,
  Maximum_Distance     smallint(5) unsigned     null,
  Charging_Time        smallint(5) unsigned     null,
  Type_Of_Battery      varchar(50) charset utf8 null,
  Tires                varchar(50) charset utf8 null,
  Accessories_included varchar(50) charset utf8 null,
  Longs                float unsigned           null,
  Wide                 float unsigned           null,
  Hight                float unsigned           null,
  id                   smallint(6) auto_increment
    primary key,
  Warranty_Battery     tinyint unsigned         null,
  Warranty_Motor       tinyint unsigned         null,
  Supplier_Id          smallint(5) unsigned     not null,
  constraint Product_Details_ibfk_1
    foreign key (Product_ID) references products (id)
)
  comment 'Chi tiết sản phẩm';

create index Product_ID
  on Product_Details (Product_ID);

create table images
(
  Product_Id smallint(5) unsigned      not null,
  link       varchar(100) charset utf8 not null,
  Id         int unsigned auto_increment
    primary key,
  constraint images_ibfk_1
    foreign key (Product_Id) references products (id)
);

create index Product_Id
  on images (Product_Id);

create table orders_details
(
  Order_ID   int unsigned         not null,
  Product_ID smallint(5) unsigned not null,
  Amount     smallint(5) unsigned not null,
  Price      decimal unsigned     not null,
  primary key (Order_ID, Product_ID),
  constraint orders_details_ibfk_1
    foreign key (Order_ID) references orders (Id),
  constraint orders_details_ibfk_2
    foreign key (Product_ID) references products (id)
);

create index Product_ID
  on orders_details (Product_ID);

create index Supplier_Id
  on products (Supplier_Id);

create table products_colors
(
  Product_Id smallint(5) unsigned not null,
  color      smallint(5) unsigned not null,
  amount     int                  not null,
  primary key (Product_Id, color),
  constraint products_colors_ibfk_1
    foreign key (Product_Id) references products (id)
);


