INSERT INTO AIRPORT(NAME,CODE) VALUES
  ('NEW DELHI','DEL'),
  ('BANGALORE','BGR'),
  ('KOLKATA','KOL'),
  ('CHENNAI','MAD');
    
  INSERT INTO FLIGHTPROVIDER(NAME) VALUES
  ('INDIGO'),
  ('SPICEJET'),
  ('VISTARA');
  
  INSERT INTO FLIGHTS(START,STARTCODE,DESTINATION,DESTCODE,DEPARTURE,ARRIVAL,PROVIDER_ID,SEATS) VALUES
  ('New Delhi',1,'Kolkata',3,'8:00','10:00',1,150),
  ('Bangalore',2,'Kolkata',3,'9:00','14:00',1,150),
  ('Kolkata',3,'Bangalore',2,'9:00','13:00',1,150),
  ('Chennai',4,'Bangalore',2,'13:00','14:30',1,150),
  ('New Delhi',1,'Chennai',4,'4:00','8:00',2,150),
  ('New Delhi',1,'Kolkata',3,'6:00','9:00',3,150),
  ('New Delhi',1,'Kolkata',3,'9:00','11:00',2,150),
  ('New Delhi',1,'Kolkata',3,'10:00','14:00',3,150);