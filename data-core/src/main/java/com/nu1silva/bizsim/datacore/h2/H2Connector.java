/*
 * Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
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
