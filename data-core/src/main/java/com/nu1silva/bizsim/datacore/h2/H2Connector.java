package com.nu1silva.bizsim.datacore.h2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class H2Connector {

    /*
    TODO - Create / Validate Database and Connection.
    Connector method
    Creator method
    Verification method

    Configuration Handler - from Util Package.
     */

    public void CreateH2Database() {
        try {
            Class.forName("org.h2.Driver");
            Connection connection = DriverManager.getConnection("jdbc:h2:~/BIZSIM", "test", "");
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE USERS");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
