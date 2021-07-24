def up():
    query="""CREATE TABLE `main_users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `gender` varchar(1) NOT NULL,
  `dob` datetime(6) NOT NULL,
  `address` varchar(200) NOT NULL,
  `state` varchar(30) NOT NULL,
  `pin_no` varchar(10) NOT NULL,
  `phone_no` varchar(20) NOT NULL,
  `emergency_no` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(200) NOT NULL,
  `active_status` varchar(1) NOT NULL,
  `user_access` varchar(1) NOT NULL,
  `created_on` datetime(6) NOT NULL,
  `updated_on` datetime(6) DEFAULT NULL,
  `last_login` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=latin1
    """    #for up mode write your query here
    return query

def down():
    query=""    #for down mode write your query here
    return query
