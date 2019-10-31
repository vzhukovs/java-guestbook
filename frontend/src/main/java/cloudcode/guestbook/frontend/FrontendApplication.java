/*---------------------------------------------------------------------------------------------
* Copyright (c) 2012-2019 Red Hat, Inc.
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*   Red Hat, Inc. - initial API and implementation
*--------------------------------------------------------------------------------------------*/
package cloudcode.guestbook.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this class serves as an entry point for the Spring Boot app
 * Here, we check to ensure all required environment variables are set
 */
@SpringBootApplication
public class FrontendApplication {

    public static void main(final String[] args) {
        SpringApplication.run(FrontendApplication.class, args);
    }

}
