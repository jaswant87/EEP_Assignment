/*
 * Copyright 2021 crunchycookie
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.crunchycookie.orion.master.service.worker;

import org.crunchycookie.orion.master.models.SubmittedTask;

/**
 * This class represents a worker node and it takes care of the essential actions which needs to be
 * done with a worker node.
 */
public interface WorkerNode {

  /**
   * Deploy a task to the worker node and start execution.
   *
   * @param submittedTask
   */
  void dispatch(SubmittedTask submittedTask);
}
