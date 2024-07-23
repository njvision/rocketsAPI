-- Insert data into sx_dimension_rocket
INSERT INTO sx_dimension_rocket (id, meters, feet)
VALUES (1, 22.25, 73),
       (2, 1.68, 5.5),
       (3, 70, 229.6),
       (4, 3.7, 12),
       (5, 12.2, 39.9),
       (6, 9, 30),
       (7, 118, 387),
       (8, 10, 32);

-- Insert data into sx_mass_rocket
INSERT INTO sx_mass_rocket (id, kg, lb)
VALUES (1, 30146, 66460),
       (2, 549054, 1207920),
       (3, 1420788, 3125735),
       (4, 1335000, 2943000);

-- Insert data into sx_thrust_stage
INSERT INTO sx_thrust_stage (id, kn, lbf)
VALUES (1, 420, 94000),
       (2, 480, 110000),
       (3, 7607, 1710000),
       (4, 8227, 1849500),
       (5, 934, 210000),
       (6, 22819, 5130000),
       (7, 24681, 5548500),
       (8, 128000, 28775544),
       (9, 138000, 31023634);

-- Insert data into sx_composite_fairing
INSERT INTO sx_composite_fairing (id, height_id, diameter_id)
VALUES (1, 1, 2),
       (2, 3, 4),
       (3, 5, 6),
       (4, 1, 2);

-- Insert data into sx_isp
INSERT INTO sx_isp (id, sea_level, vacuum)
VALUES (1, 267, 304),
       (2, 288, 312),
       (3, 288, 312),
       (4, 330, 380);

-- Insert data into sx_engines
INSERT INTO sx_engines (id, number, type, version, layout, isp_id, engine_loss_max, propellant_1, propellant_2,
                        thrust_sea_level_id, thrust_vacuum_id, thrust_to_weight)
VALUES (1, 1, 'merlin', '1C', 'single', 1, 0, 'liquid oxygen', 'RP-1 kerosene', 1, 2, 96),
       (2, 9, 'merlin', '1D+', 'octaweb', 2, 2, 'liquid oxygen', 'RP-1 kerosene', 3, 4, 180.1),
       (3, 27, 'merlin', '1D+', 'octaweb', 3, 6, 'liquid oxygen', 'RP-1 kerosene', 5, 6, 180.1),
       (4, 37, 'raptor', '1C', '', 1, 4, 'liquid oxygen', 'liquid methane', 7, 8, 107);

-- Insert data into sx_landing_legs
INSERT INTO sx_landing_legs (id, number, material)
VALUES (1, 0, NULL),
       (2, 4, 'carbon fiber'),
       (3, 12, 'carbon fiber'),
       (4, 6, 'stainless steel');

-- Insert data into sx_first_stage
INSERT INTO sx_first_stage (id, reusable, engines, fuel_amount_tons, burn_time_sec, thrust_sea_level_id, thrust_vacuum_id)
VALUES (1, FALSE, 1, 44.3, 169, 1, 2),
       (2, TRUE, 9, 385, 162, 3, 4),
       (3, TRUE, 27, 1155, 162, 5, 6),
       (4, TRUE, 37, 3300, 162, 7, 8);

-- Insert data into sx_image_url
INSERT INTO sx_image_url (id, url)
VALUES (1, 'https://example.com/falcon1.jpg'),
       (2, 'https://example.com/falcon9.jpg'),
       (3, 'https://example.com/falconheavy.jpg'),
       (4, 'https://example.com/starship.jpg');

-- Insert data into sx_payloads
INSERT INTO sx_payloads (id, option_1, option_2, composite_fairing_id)
VALUES (1, 'Option 1', 'Option 2', 1),
       (2, 'Option A', 'Option B', 2),
       (3, 'Option X', 'Option Y', 3),
       (4, 'Option Red', 'Option Blue', 1);

-- Insert data into sx_second_stage
INSERT INTO sx_second_stage (id, engines, fuel_amount_tons, burn_time_sec, thrust_id, payloads_id)
VALUES (1, 1, 3.38, 378, 1, 1),
       (2, 1, 90, 397, 2, 2),
       (3, 1, 90, 397, 3, 3),
       (4, 6, 90, 1200, 4, 4);

-- Insert data into sx_rocket
INSERT INTO sx_rocket (active, stages, boosters, cost_per_launch, success_rate_pct, first_flight, country, company,
                       height_id, diameter_id, mass_id, first_stage_id, second_stage_id, engines_id, landing_legs_id,
                       wikipedia, description, rocket_id, rocket_name, rocket_type)
VALUES (TRUE, 1, 0, 6700000, 100, '2006-03-24', 'USA', 'SpaceX', 1, 2, 1, 1, 1, 1, 1,
        'https://en.wikipedia.org/wiki/Falcon_1', 'Falcon 1 is an expendable rocket', 'falcon_1', 'Falcon 1',
        'rocket'),
       (TRUE, 2, 0, 62000000, 98, '2010-06-04', 'USA', 'SpaceX', 3, 4, 2, 2, 2, 2, 2,
        'https://en.wikipedia.org/wiki/Falcon_9', 'Falcon 9 is a reusable rocket', 'falcon_9', 'Falcon 9',
        'rocket'),
       (TRUE, 2, 0, 97000000, 95, '2018-02-06', 'USA', 'SpaceX', 5, 6, 3, 3, 3, 3, 3,
        'https://en.wikipedia.org/wiki/Falcon_Heavy', 'Falcon Heavy is the most powerful rocket', 'falcon_heavy',
        'Falcon Heavy', 'rocket'),
       (TRUE, 3, 0, 200000000, 92, '2020-12-17', 'USA', 'SpaceX', 7, 8, 4, 4, 4, 4, 4,
        'https://en.wikipedia.org/wiki/Starship_(spacecraft)', 'Starship is a fully reusable spacecraft', 'starship',
        'Starship', 'rocket');

-- Insert data into sx_payload_weights
INSERT INTO sx_payload_weights (id, rocket_id, payload_id, name, kg, lb)
VALUES (1, 1, 'payload_1', 'Satellite A', 500, 1102),
       (2, 2, 'payload_2', 'Satellite B', 6000, 13228),
       (3, 3, 'payload_3', 'Satellite C', 25000, 55116),
       (4, 4, 'payload_4', 'Satellite D', 100000, 220462);

-- Insert data into sx_flickr_images
INSERT INTO sx_flickr_images (id, rocket_id, url_id)
VALUES (1, 1, 1),
       (2, 2, 2),
       (3, 3, 3),
       (4, 4, 4);
