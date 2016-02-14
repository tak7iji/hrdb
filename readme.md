## table
    create table tbl1 (col1 int not null primary key, col2 char(10));
    
## pdsql
    set auto commit off;
    select col2 from tbl1 where col1=1 for update nowait;
    