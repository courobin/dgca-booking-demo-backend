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

package eu.europa.ec.dgc.booking.entity;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class DccStatusResultEntity {

    private String identifier;

    private DccStatusResult result;

    private DccStatusType type;

    private String details;

    /**
     * Build DCCStatusResultEntity with OPEN result.
     * 
     * @return {@link DccStatusResultEntity}
     */
    public static DccStatusResultEntity open() {
        return DccStatusResultEntity.builder()
                .identifier("Demo identifier")
                .result(DccStatusResult.OPEN)
                .type(DccStatusType.TECHNICAL_CHECK)
                .build();
    }

    /**
     * Build DCCStatusResultEntity with FAILED result.
     * 
     * @return {@link DccStatusResultEntity}
     */
    public static DccStatusResultEntity failed() {
        return DccStatusResultEntity.builder()
                .identifier("Demo identifier")
                .result(DccStatusResult.FAILED)
                .type(DccStatusType.ISSUER_INVALIDATION)
                .build();
    }

    /**
     * Build DCCStatusResultEntity with PASSED result.
     * 
     * @return {@link DccStatusResultEntity}
     */
    public static DccStatusResultEntity passed() {
        return DccStatusResultEntity.builder()
                .identifier("Demo identifier")
                .result(DccStatusResult.PASSED)
                .type(DccStatusType.ACCEPTANCE)
                .build();
    }
}
