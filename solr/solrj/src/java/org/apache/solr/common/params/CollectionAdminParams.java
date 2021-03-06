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
 */
package org.apache.solr.common.params;

import java.util.Arrays;
import java.util.Collection;

public interface CollectionAdminParams {

  /* Param used by DELETESTATUS call to clear all stored responses */
  String FLUSH = "flush";

  String COLLECTION = "collection";

  String COUNT_PROP = "count";

  String ROLE = "role";

  /** Predefined system collection name. */
  String SYSTEM_COLL = ".system";

  /**
   * A parameter to specify list of Solr nodes to be used (e.g. for collection creation or restore operation).
   */
  String CREATE_NODE_SET_PARAM = "createNodeSet";

  /**
   * A parameter which specifies if the provided list of Solr nodes (via {@linkplain #CREATE_NODE_SET_PARAM})
   * should be shuffled before being used.
   */
  String CREATE_NODE_SET_SHUFFLE_PARAM = "createNodeSet.shuffle";

  /**
   * A parameter to specify the name of the index backup strategy to be used.
   */
  String INDEX_BACKUP_STRATEGY = "indexBackup";

  /**
   * This constant defines the index backup strategy based on copying index files to desired location.
   */
  String COPY_FILES_STRATEGY = "copy-files";

  /**
   * This constant defines the strategy to not copy index files (useful for meta-data only backup).
   */
  String NO_INDEX_BACKUP_STRATEGY = "none";

  /**
   * This constant defines a list of valid index backup strategies.
   */
  Collection<String> INDEX_BACKUP_STRATEGIES =
      Arrays.asList(COPY_FILES_STRATEGY, NO_INDEX_BACKUP_STRATEGY);

  /**
   * Name of collection property to set
   */
  String PROPERTY_NAME = "propertyName";

  /**
   * Value of collection property to set
   */
  String PROPERTY_VALUE = "propertyValue";

  /**
   * The name of the config set to be used for a collection
   */
  String COLL_CONF = "collection.configName";
}
