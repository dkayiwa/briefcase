/*
 * Copyright (C) 2017 Shivam Tripathi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.opendatakit.briefcase.model;

public class ExportProgressPercentageEvent {
  private final double progress;
  private final BriefcaseFormDefinition formDefinition;

  public ExportProgressPercentageEvent(double progress, BriefcaseFormDefinition formDefinition) {
    this.progress = progress;
    this.formDefinition = formDefinition;
  }

  public double getProgress() {
    return progress;
  }

  public BriefcaseFormDefinition getFormDefinition() {
    return formDefinition;
  }
}
