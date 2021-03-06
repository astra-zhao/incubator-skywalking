/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.alarm;

import lombok.*;

/**
 * Alarm message represents the details of each alarm.
 *
 * @author wusheng, peng-yongsheng
 */
@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
public class AlarmMessage {

    public static AlarmMessage NONE = new NoAlarm();

    private int scopeId;
    private String name;
    private int id0;
    private int id1;
    private String alarmMessage;
    private long startTime;

    private static class NoAlarm extends AlarmMessage {

    }
}
