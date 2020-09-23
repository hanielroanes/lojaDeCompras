INSERT INTO categoria(nome) values ('Informática');
insert into categoria(nome) values ('Escritorio');

insert into produto(nome, preco) values ('Computador', 2000.00);
insert into produto(nome, preco) values ('Impressora', 800.00);
insert into produto(nome, preco) values ('Mouse', 80.00);

insert into produto_categoria(categoria_id, produto_id) values (1,1);
insert into produto_categoria(categoria_id, produto_id) values (1,2);
insert into produto_categoria(categoria_id, produto_id) values (2,2);
insert into produto_categoria(categoria_id, produto_id) values (1,3);

insert into estado(nome) values ('SP');
insert into estado(nome) values ('MG');

insert into cidade(nome, estado_id) values ('São Paulo', 1);
insert into cidade(nome, estado_id) values ('Uberlandia', 2);
insert into cidade(nome, estado_id) values ('Campinas', 1);
