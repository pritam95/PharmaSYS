def up():
    query="""CREATE TABLE app_role (
    role_id int NOT NULL AUTO_INCREMENT,
    role_name varchar(255) NOT NULL,
    role_value int NOT NULL,
    role_active varchar(1) NOT NULL,
    created_on datetime(6) NOT NULL,
    updated_on datetime(6) DEFAULT NULL,
    PRIMARY KEY (role_id)
);"""    #for up mode write your query here
    return query

def down():
    query=""    #for down mode write your query here
    return query
