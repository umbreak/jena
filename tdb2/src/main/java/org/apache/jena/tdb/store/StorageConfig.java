/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jena.tdb.store;

import java.util.Map ;

import org.apache.jena.tdb.sys.FileRef ;
import org.seaborne.dboe.base.block.BlockMgr ;
import org.seaborne.dboe.base.file.BufferChannel ;
import org.seaborne.dboe.base.file.Location ;
import org.seaborne.tdb2.setup.StoreParams ;
import org.seaborne.tdb2.store.nodetable.NodeTable ;

public class StorageConfig
{
    public final StoreParams params ;
    public final Map<FileRef, BlockMgr> blockMgrs ;
    public final Map<FileRef, BufferChannel> bufferChannels ;
    public final Map<FileRef, NodeTable> nodeTables ;
    public final Location location ;
    public final boolean writeable ;

    public StorageConfig(Location location, StoreParams params, boolean writeable, 
                         Map<FileRef, BlockMgr> blockMgrs, 
                         Map<FileRef, BufferChannel> bufferChannels,
                         Map<FileRef, NodeTable> nodeTables)
    {
        this.location = location ;
        this.params = params ;
        this.blockMgrs = blockMgrs ;
        this.bufferChannels = bufferChannels ;
        this.nodeTables = nodeTables ;
        this.writeable = writeable ;
    }
    
}
