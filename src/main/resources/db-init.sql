
create table customer (
	cid int generated always as identity, 
	name varchar(32) not null, 
	primary key (cid)
);

create table product (
	pid int generated always as identity, 
	name varchar(32) not null, 
	primary key (pid)
);

create table bestellung (
	oid int generated always as identity, 
	cid int, 
	pid int, 
	amount int, 
	constraint fk_customer_id foreign key (cid) references customer(cid), 
	constraint fk_product_id foreign key (pid) references product(pid)
);

