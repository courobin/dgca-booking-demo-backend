/*-
 * ---license-start
 * European Digital COVID Certificate Booking Demo / dgca-booking-demo-backend
 * ---
 * Copyright (C) 2021 T-Systems International GmbH and all other contributors
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---license-end
 */

package eu.europa.ec.dgc.booking.dto;

import java.util.List;
import lombok.Data;

@Data
public class ResultStatusRequest {

    private String token;

    private ResultStatusDccStatusRequest dccStatus;

    @Data
    public static final class ResultStatusDccStatusRequest {

        private String issuer;

        private Long iat;

        private String sub;

        private List<ResultStatusDccStatusResultRequest> results;
    }

    @Data
    public static final class ResultStatusDccStatusResultRequest {

        private String identifier;

        private String result;

        private String type;

        private String details;
    }
}
