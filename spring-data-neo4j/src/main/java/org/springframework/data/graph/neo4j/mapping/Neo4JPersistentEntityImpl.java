/**
 * Copyright 2011 the original author or authors.
 *
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
 */

package org.springframework.data.graph.neo4j.mapping;

import org.springframework.data.mapping.model.BasicPersistentEntity;
import org.springframework.data.util.TypeInformation;

/**
 * Implementation of {@link Neo4JPersistentEntity}.
 *
 * @author Oliver Gierke
 */
class Neo4JPersistentEntityImpl<T> extends BasicPersistentEntity<T, Neo4JPersistentProperty> implements Neo4JPersistentEntity<T> {

    /**
     * Creates a new {@link Neo4JPersistentEntityImpl} instance.
     * 
     * @param information must not be {@literal null}.
     */
    public Neo4JPersistentEntityImpl(TypeInformation<T> information) {
        super(information);
    }
}