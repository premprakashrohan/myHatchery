Insert into users (user_id, name, password, email,active,last_name) VALUES (-1, 'prem', '$2a$10$hhuXnFI.gvMu/sMzsl7Kw.yGd9FH9LhQ.rJjjxtboxYOGayJoBKHe', 'premprakashrohan@gmail.com',true,'Rohan'); 
Insert into roles (role_id,role) values (1,'ADMIN'),(2, 'USER');
Insert into user_role (user_id,role_id) values (-1,1),(-1,2);
	