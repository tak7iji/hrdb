## table
    create table tbl1 (col1 int not null primary key, col2 char(10));
    insert into tbl1 values(1, 'aaa');
    
    create table tbl2 (id int, col2 timestamp(4));
    insert into tbl2 values(1, '2016-02-18 10:10:00.0');
    insert into tbl2 values(2, '2016-02-18 10:10:00.1');
    insert into tbl2 values(3, '2016-02-18 10:10:00.2');

## pdsql
    set auto commit off;
    select col2 from tbl1 where col1=1 for update nowait;
    