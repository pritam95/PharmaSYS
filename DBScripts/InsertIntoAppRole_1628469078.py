def up():
    query="""INSERT INTO app_role (role_name,role_value,role_active,created_on,updated_on) VALUES ('Team Member',1,'Y',NOW(),null);
    INSERT INTO app_role (role_name,role_value,role_active,created_on,updated_on) VALUES ('Team Lead',4,'Y',NOW(),null);
    """    #for up mode write your query here
    return query

def down():
    query=""    #for down mode write your query here
    return query
