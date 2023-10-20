-- Create a sequence for generating IDs
CREATE SEQUENCE bike_sequence START WITH 1 INCREMENT BY 1;

-- Insert 1
INSERT INTO bikes(id, name, model, date_created, price, image, warranty_status)
VALUES (nextval('bike_sequence'), 'John Doe', 'jdoe', current_date, 1000, E'\\x89504E470D0A1A0A', 'active');

-- Insert 2
INSERT INTO bikes(id, name, model, date_created, price, image, warranty_status)
VALUES (nextval('bike_sequence'), 'Alice Johnson', 'ajohnson', current_date, 800, E'\\x89504E470D0A1A0B', 'active');

-- Insert 3
INSERT INTO bikes(id, name, model, date_created, price, image, warranty_status)
VALUES (nextval('bike_sequence'), 'Bob Smith', 'bsmith', current_date, 750, E'\\x89504E470D0A1A0C', 'active');

-- Insert 4
INSERT INTO bikes(id, name, model, date_created, price, image, warranty_status)
VALUES (nextval('bike_sequence'), 'Emily Brown', 'ebrown', current_date, 900, E'\\x89504E470D0A1A0D', 'active');

-- Insert 5
INSERT INTO bikes(id, name, model, date_created, price, image, warranty_status)
VALUES (nextval('bike_sequence'), 'Michael Johnson', 'mjohnson', current_date, 1200, E'\\x89504E470D0A1A0E', 'active');
