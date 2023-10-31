INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('abb6b6f7-e7b2-4507-92f1-e9583b01767b', 'Jane Smith', 'Jane Smith', '2023-06-17 05:54:28.000000', '2023-03-04 06:52:02.000000', 'Italian');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('745cb43f-9354-4d8b-8040-029dcd333b0e', 'John Doe', 'John Doe', '2023-01-29 18:57:35.000000', '2023-02-15 07:28:52.000000', 'Mexican');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('9e18ef29-73a4-4410-8538-059e31827a05', 'Michael Johnson', 'Michael Johnson', '2022-11-27 13:29:10.000000', '2022-11-21 06:42:35.000000', 'Chinese');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('3863f929-6221-49f5-b430-6ae6e418f64e', 'John Doe', 'Emily Davis', '2022-11-25 06:06:17.000000', '2022-12-28 02:07:05.000000', 'Indian');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('ec93c25c-d3b7-46e3-b8fb-cb3691fe4d6d', 'John Doe', 'John Doe', '2023-04-20 23:09:18.000000', '2022-12-20 05:23:16.000000', 'Japanese');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('2875c834-9af6-4dd7-a5c3-1114d0e77af1', 'John Doe', 'John Doe', '2022-12-20 09:14:29.000000', '2023-02-06 10:59:31.000000', 'Thai');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('6534f11d-dc19-4b55-9cc3-ef833c9c445f', 'Jane Smith', 'John Doe', '2023-01-23 05:18:01.000000', '2023-06-20 08:37:39.000000', 'Greek');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('451d77f5-2a71-407c-9d59-8007c94d435c', 'John Doe', 'John Doe', '2022-12-26 21:05:23.000000', '2023-06-25 22:10:54.000000', 'French');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('0231bb12-4eb7-456b-bd15-7253a4cfd3b0', 'Michael Johnson', 'David Wilson', '2023-07-07 13:03:45.000000', '2022-12-07 11:12:39.000000', 'Spanish');
INSERT INTO public.cuisine (id, created_by, updated_by, created_at, updated_at, name) VALUES ('d2c8ab60-ed25-416a-b8e2-f5e8b9ffbaec', 'David Wilson', 'Michael Johnson', '2023-01-12 13:58:50.000000', '2023-10-05 06:55:54.000000', 'American');

INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('e37dcb61-37a0-46db-8a1c-f888f97649b7', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabor Celestial', 1, true, true, 'abb6b6f7-e7b2-4507-92f1-e9583b01767b');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('d99cfac7-0f46-4800-95db-4ab81cb912d9', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Mesa dos Sabores', 1, true, false, 'abb6b6f7-e7b2-4507-92f1-e9583b01767b');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('9d43d7a1-adc2-464b-8d8c-fd3c9057795d', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Terra & Sabor', 1, true, true, 'abb6b6f7-e7b2-4507-92f1-e9583b01767b');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('baa7371b-2ab9-4ec5-8cab-dbb8e3dfd5f9', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Gastronomia Encantada', 1, false, false, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('d86b53bd-8449-4910-8676-0794c52ccefd', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Delícias da Estação', 1, true, true, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('315d1035-9a3c-48d6-8083-8c434d3eb2ee', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Riqueza no Prato', 1, true, false, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('82d5d857-2f9f-466a-b02f-aa13f36feea9', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabores Exóticos', 1, true, true, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('9a925fc6-9765-477a-bf87-06c63929137e', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Bistrô da Querência', 1, true, false, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('06c6686f-d1cf-41dd-a0bc-c520ea64abc1', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Gosto da Vida', 1, true, true, '745cb43f-9354-4d8b-8040-029dcd333b0e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('299efdc5-a6fa-413e-8ec1-3e87cd5f2601', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Cantinho Gourmet', 1, true, true, '3863f929-6221-49f5-b430-6ae6e418f64e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('12a37930-7b3e-4a81-9e33-ce1d269ada25', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Cozinha dos Aromas', 1, false, false, '3863f929-6221-49f5-b430-6ae6e418f64e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('efd31fbb-5a7b-4ab1-8796-6e30127ffae4', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabor e Arte', 1, true, false, '3863f929-6221-49f5-b430-6ae6e418f64e');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('5dbbf756-fc26-4c6c-8317-004934be5ed6', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Paladar Divino', 1, true, true, 'ec93c25c-d3b7-46e3-b8fb-cb3691fe4d6d');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('208281c3-7f51-4159-9e95-6e395095ea43', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Bistrô das Delícias', 1, true, false, 'ec93c25c-d3b7-46e3-b8fb-cb3691fe4d6d');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('78977758-4edb-4088-8265-b9001e325923', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Comida dos Deuses', 1, true, true, 'ec93c25c-d3b7-46e3-b8fb-cb3691fe4d6d');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('89bce4a6-5cfd-4caa-8d90-19fa30e8dd59', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Estação Gourmet', 1, false, false, '2875c834-9af6-4dd7-a5c3-1114d0e77af1');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('c20187a4-fe63-49e7-bbe6-c08be282e626', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Ponto de Sabor', 1, true, true, '2875c834-9af6-4dd7-a5c3-1114d0e77af1');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('70cb40bf-33ed-4553-8e1c-9976aead3f0c', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Gula Elegante', 1, false, false, '2875c834-9af6-4dd7-a5c3-1114d0e77af1');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('36622d1a-d64b-4260-ad64-d473186e3b51', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabores do Oriente', 1, true, true, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('1c144ff9-bc5d-4e53-8cbb-0899a12d7c95', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Gastronomia Urbana', 1, true, false, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('17a99b07-9bf7-4a83-b7a3-b229ce42ca7e', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Mesa dos Sentidos', 1, true, true, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('5ea68138-0ec5-4d13-8a97-4c0cadb51a08', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Encanto Gastronômico', 1, true, false, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('1fe771c0-d2b4-47ab-813d-9c3f498764f6', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabor à Moda', 1, true, true, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('7971b35e-8754-43d7-8d39-25877b3b81a5', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Restaurante Vida Gourmet', 1, false, false, '6534f11d-dc19-4b55-9cc3-ef833c9c445f');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('f2baa040-34dd-432e-8274-8bdd38f96bf9', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Chef na Praça', 1, true, true, '451d77f5-2a71-407c-9d59-8007c94d435c');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('189ae13d-8d0e-47ab-bbb3-a82ebe8f0a67', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Deguste e Aprecie', 1, true, true, '451d77f5-2a71-407c-9d59-8007c94d435c');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('cac3cb12-0675-46d8-914e-4fd4d4de8314', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabor e Companhia', 1, false, false, '451d77f5-2a71-407c-9d59-8007c94d435c');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('d8fc5942-dea8-4f20-9a89-5e841c2843ef', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Refúgio Gastronômico', 1, true, true, '0231bb12-4eb7-456b-bd15-7253a4cfd3b0');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('0929836c-804d-4f98-a216-01e25c66a7f2', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Gosto e Sossego', 1, true, false, '0231bb12-4eb7-456b-bd15-7253a4cfd3b0');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('af0e599d-351f-4a1f-9ce2-563edb52fcd4', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Cozinha Criativa', 1, true, false, '0231bb12-4eb7-456b-bd15-7253a4cfd3b0');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('d17d44ef-48ed-4953-b96d-b018c90d8d51', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Banquete à Beira-Mar', 1, true, true, 'd2c8ab60-ed25-416a-b8e2-f5e8b9ffbaec');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('7b3a1a61-8f73-44df-b170-c89380dabf40', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Sabor e Simplicidade', 1, false, false, 'd2c8ab60-ed25-416a-b8e2-f5e8b9ffbaec');
INSERT INTO public.restaurant (id, created_by, updated_by, created_at, updated_at, name, shipping_rate, active, open, cuisine_id) VALUES ('01051581-018e-4ee9-996f-83d6753cc237', null, null, '2023-10-21 10:07:42.380770', '2023-10-21 10:09:35.037836', 'Cantina do Bem Comer', 1, true, true, 'd2c8ab60-ed25-416a-b8e2-f5e8b9ffbaec');

INSERT INTO public.payment_method (id, description) VALUES ('bf5a389e-a64e-4eb5-ab3d-8d73baf59e7d', 'Cartão de crédito');
INSERT INTO public.payment_method (id, description) VALUES ('763defe0-5683-42aa-8b81-df7367bb224e', 'Cartão de débito');
INSERT INTO public.payment_method (id, description) VALUES ('a84b34dd-807e-476a-ba21-a70c5f8cc266', 'Transferência bancária');
INSERT INTO public.payment_method (id, description) VALUES ('4533eaa4-7d8f-4128-a6fa-4350ef4aadf7', 'Boleto bancário');
INSERT INTO public.payment_method (id, description) VALUES ('c1648f87-ea76-43b5-a5f3-850aab0f679e', 'PIX');
INSERT INTO public.payment_method (id, description) VALUES ('74fb4592-33ee-405c-9f3c-a86a34faf489', 'Cartão vale refeição');
INSERT INTO public.payment_method (id, description) VALUES ('1aa11b67-caa3-4296-bf3e-96c957df648d', 'Cartão vale alimentação');
INSERT INTO public.payment_method (id, description) VALUES ('324563a2-7651-406b-a72b-5b766e669b1b', 'Pagamento por QR Code');
INSERT INTO public.payment_method (id, description) VALUES ('6ae60d0b-ec59-4b6f-beac-ed786a8fc44f', 'PayPal');
INSERT INTO public.payment_method (id, description) VALUES ('09faeafc-8d48-4e3c-bd19-d4cbfb95daa3', 'Boleto');