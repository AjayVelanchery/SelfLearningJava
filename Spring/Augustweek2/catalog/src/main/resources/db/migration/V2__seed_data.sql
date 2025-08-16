INSERT INTO category (name, description) VALUES
('Electronics', 'Devices and gadgets'),
('Books', 'Printed and digital books');

INSERT INTO product (name, description, price, stock_quantity, category_id) VALUES
('Smartphone', 'Latest 5G phone', 599.99, 50, 1),
('Laptop', 'Gaming laptop', 1299.99, 30, 1),
('Java Programming Book', 'Learn Java from scratch', 29.99, 100, 2);

INSERT INTO users (username, email, password) VALUES
('alice', 'alice@example.com', 'password'),
('bob',   'bob@example.com',   'password');
