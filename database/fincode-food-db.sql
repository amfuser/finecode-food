/* Create the database */

create database food_categroy;

/* Create the food category tables */

create table food_category 
(
	id INT(11) NOT NULL AUTO_INCREMENT,
  	name VARCHAR(25) NOT NULL,
  	creation_date DATE,
  	CONSTRAINT food_category_pk PRIMARY KEY (id)
);

/* TODO: add a user_id column to the food_category table */

/* insert the categories */

insert into food_category values(0, 'canned foods', CURDATE());
insert into food_category values(0, 'deli', CURDATE());
insert into food_category values(0, 'packaged', CURDATE());
insert into food_category values(0, 'bake', CURDATE());
insert into food_category values(0, 'condiments', CURDATE());
insert into food_category values(0, 'dairy', CURDATE());
insert into food_category values(0, 'household', CURDATE());
insert into food_category values(0, 'beverage', CURDATE());
insert into food_category values(0, 'meat', CURDATE());
insert into food_category values(0, 'produce', CURDATE());
insert into food_category values(0, 'freezer', CURDATE());

-- select * from food_category;


create table food_sub_category
(
	id INT(11) NOT NULL AUTO_INCREMENT,
  	name VARCHAR(25) NOT NULL,
  	category_id INT(11) NOT NULL,
  	creation_date DATE,
  	CONSTRAINT food_category_pk PRIMARY KEY (id),
  	FOREIGN KEY(category_id)
        REFERENCES food_category(id)
);


/* produce subcategories */

insert into food_sub_category values(0, 'vegetable', 10, CURDATE());
insert into food_sub_category values(0, 'fruit', 10, CURDATE());
insert into food_sub_category values(0, 'herbs', 10, CURDATE());


/* packaged subcategories */

insert into food_sub_category values(0, 'grains', 3, CURDATE());
insert into food_sub_category values(0, 'pasta', 3, CURDATE());
insert into food_sub_category values(0, 'cereal', 3, CURDATE());
insert into food_sub_category values(0, 'general', 3, CURDATE());


/* dairy subcategories */

insert into food_sub_category values(0, 'cheese', 6, CURDATE());
insert into food_sub_category values(0, 'yogurt', 6, CURDATE());
insert into food_sub_category values(0, 'general', 6, CURDATE());


-- select * from food_sub_category fsc;

/* Add the food_item table */
/* food items are the actual foods themselves - e.g. soups, breads etc. */

create table food_vendor
(
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(100),
	marketid INT(15),
	CONSTRAINT food_vendor_pk PRIMARY KEY (id)
)

-- drop table food_item;

create table food_item
(
	id INT(11) NOT NULL AUTO_INCREMENT,
	category_id INT(11) NOT NULL,
	sub_category_id INT(11),
	vendor_id INT(11) NOT NULL,
	name VARCHAR(25) NOT NULL,
	amount FLOAT(4,2),
	description VARCHAR(100),
	creation_date DATE,
	CONSTRAINT food_item_pk PRIMARY KEY (id),
	FOREIGN KEY(category_id)
        REFERENCES food_category(id)
)

-- drop table food_inventory

create table food_inventory
(
	id INT(11) NOT NULL AUTO_INCREMENT,
	item_id INT(11) NOT NULL,
	number INT(11) NOT NULL,
	expiration_date DATE,
	creation_date DATE,
	CONSTRAINT food_item_pk PRIMARY KEY (id),
	FOREIGN KEY(item_id)
        REFERENCES food_item(id)
)


/* Add upc barcode barcode */

alter table food_item 
add column upc_barcode varchar(25) 
after vendor_id;


/* Queries for test */

select
	*
from 
	food_inventory fi 
	right join food_item fi2 on fi.item_id = fi2.id 
	right join food_category fc on fi2.category_id = fc.id 
	right join food_sub_category fsc on fc.id = fsc.category_id 
	right join food_vendor fv on fi2.vendor_id = fv.id 
	
	
select 
	*
from 
	food_category fc 
	
	

