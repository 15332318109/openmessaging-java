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
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging;

import io.openmessaging.exception.OMSResourceNotExistException;
import java.util.List;

/**
 * @author vintagewang@apache.org
 *
 * @version OMS 1.0
 * @since OMS 1.0
 */
public interface ResourceManager extends ServiceLifecycle {
    void createAndUpdateNamespace(final String nsName, KeyValue properties);

    void createAndUpdateTopic(final String topicName, KeyValue properties);

    void createAndUpdateQueue(final String queueName, KeyValue properties);

    void destroyNamespace(final String nsName);

    void destroyTopic(final String topicName);

    void destroyQueue(final String queueName);

    KeyValue getNamespaceProperties(final String nsName) throws OMSResourceNotExistException;

    KeyValue getTopicProperties(final String topicName) throws OMSResourceNotExistException;

    KeyValue getQueueProperties(final String queueName) throws OMSResourceNotExistException;

    List<String> consumerIdListInQueue(final String queueName) throws OMSResourceNotExistException;

    KeyValue getConsumerProperties(final String consumerId) throws OMSResourceNotExistException;

    void serConsumerProperties(final String consumerId, final KeyValue properties) throws OMSResourceNotExistException;

    List<String> producerIdListInQueue(final String queueName) throws OMSResourceNotExistException;

    List<String> producerIdListInTopic(final String topic) throws OMSResourceNotExistException;

    KeyValue getProducerProperties(final String producerId) throws OMSResourceNotExistException;

    void serProducerProperties(final String producerId, final KeyValue properties) throws OMSResourceNotExistException;

}
