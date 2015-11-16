/*
 * Copyright (c) 2014-2015 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, without warranties or
 * conditions of any kind, EITHER EXPRESS OR IMPLIED.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.vmware.dcp.services.samples;

import com.vmware.dcp.common.FactoryService;
import com.vmware.dcp.common.Service;
import com.vmware.dcp.services.common.ServiceUriPaths;

public class SampleSimpleEchoFactoryService extends FactoryService {
    /**
     * Appropriate self-link (URI path) of singleton services, started by default
     */
    public static final String SELF_LINK = ServiceUriPaths.SAMPLES + "/echoes";

    public SampleSimpleEchoFactoryService() {
        super(SampleSimpleEchoService.EchoServiceState.class);
    }

    @Override
    public Service createServiceInstance() throws Throwable {
        return new SampleSimpleEchoService();
    }

}