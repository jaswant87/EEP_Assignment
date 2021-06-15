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

package org.crunchycookie.orion.master.models;

import java.io.InputStream;

public class TaskFile {

  private TaskFileMetadata metadata;
  private InputStream fileDataStream;

  public TaskFile(TaskFileMetadata metadata, InputStream fileDataStream) {
    this.metadata = metadata;
    this.fileDataStream = fileDataStream;
  }

  public TaskFile(TaskFileMetadata metadata) {
    this.metadata = metadata;
  }

  public TaskFileMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(TaskFileMetadata metadata) {
    this.metadata = metadata;
  }

  public InputStream getFileDataStream() {
    return fileDataStream;
  }

  public void setFileDataStream(InputStream fileDataStream) {
    this.fileDataStream = fileDataStream;
  }
}
