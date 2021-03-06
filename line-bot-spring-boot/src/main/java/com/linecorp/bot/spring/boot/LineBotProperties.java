/*
 * Copyright 2016 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.bot.spring.boot;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.linecorp.bot.client.LineMessagingServiceBuilder;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "line.bot")
public class LineBotProperties {
    /**
     * Channel acccess token.
     */
    @Valid
    @NotNull
    private String channelToken;

    /**
     * Channel secret
     */
    @Valid
    @NotNull
    private String channelSecret;

    @Valid
    @NotNull
    private String apiEndPoint = LineMessagingServiceBuilder.DEFAULT_API_END_POINT;

    /**
     * Connection timeout in milliseconds
     */
    @Valid
    @NotNull
    private long connectTimeout = LineMessagingServiceBuilder.DEFAULT_CONNECT_TIMEOUT;

    /**
     * Read timeout in milliseconds
     */
    @Valid
    @NotNull
    private long readTimeout = LineMessagingServiceBuilder.DEFAULT_READ_TIMEOUT;

    /**
     * Write timeout in milliseconds
     */
    @Valid
    @NotNull
    private long writeTimeout = LineMessagingServiceBuilder.DEFAULT_WRITE_TIMEOUT;
}
