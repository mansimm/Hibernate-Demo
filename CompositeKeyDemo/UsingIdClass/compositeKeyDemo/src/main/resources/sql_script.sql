drop table if exists customer;
drop table if exists cusomer_loan;
drop table if exists loan;


create table customer(customer_id int primary key,customer_name varchar(15), date_of_birth date, address varchar(25), phone_no long);

insert into customer values( 101, 'Yota', '2000-01-01', 'London',1212121212);

create table loan(loan_id int primary key, loan_name varchar(15), rate_of_interest double);

insert into loan values(1, 'Home loan',20.0);

create table customer_loan(customer_id int references customer(customer_id), loan_id int references loan(loan_id), eligible_amount double, availed_Amount double, tenure_in_years int, primary key(customer_id, loan_id));
