INSERT INTO customer(first_name, last_name, email) VALUES ('Maria', 'Silva', 'maria@gmail.com');
INSERT INTO customer(first_name, last_name, email) VALUES ('Robert', 'Smith', 'bob@gmail.com');
INSERT INTO customer(first_name, last_name, email) VALUES ('Alex', 'Alves', 'alex@gmail.com');
INSERT INTO customer(first_name, last_name, email) VALUES ('Ana', 'Santos', 'ana@gmail.com');

INSERT INTO equities(ticker, name, market_price) VALUES ('GOOGL', 'Alphabet Inc. Class A', '123.30');
INSERT INTO equities(ticker, name, market_price) VALUES ('AAPL', 'Apple Inc.', '169.09');
INSERT INTO equities(ticker, name, market_price) VALUES ('NVDA', 'NVIDIA Corporation', '411.13');
INSERT INTO equities(ticker, name, market_price) VALUES ('AMZN', 'Amazon.com, Inc.', '129.10');
INSERT INTO equities(ticker, name, market_price) VALUES ('GME', 'GameStop Corporation', '13.19');

INSERT INTO portfolio(balance) VALUES ('200.00');
INSERT INTO portfolio(balance) VALUES ('564.21');
INSERT INTO portfolio(balance) VALUES ('50.50');
INSERT INTO portfolio(balance) VALUES ('250.50');

INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('1', '5', "1");
INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('2', '3', '2');
INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('3', '4', '3');
INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('4', '7', '4');
INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('5', '10', '1');
INSERT INTO equities_quantity(equities_id, quantity, portfolio_id) VALUES ('1', '7', '3');