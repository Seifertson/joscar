/*
 *  Copyright (c) 2003, The Joust Project
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without 
 *  modification, are permitted provided that the following conditions 
 *  are met:
 *
 *  - Redistributions of source code must retain the above copyright 
 *    notice, this list of conditions and the following disclaimer. 
 *  - Redistributions in binary form must reproduce the above copyright 
 *    notice, this list of conditions and the following disclaimer in 
 *    the documentation and/or other materials provided with the 
 *    distribution. 
 *  - Neither the name of the Joust Project nor the names of its
 *    contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS 
 *  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT 
 *  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS 
 *  FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE 
 *  COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
 *  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
 *  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER 
 *  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT 
 *  LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN 
 *  ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 *  POSSIBILITY OF SUCH DAMAGE.
 *
 *  File created by Keith @ 4:14:43 AM
 *
 */

package net.kano.joscar.rvcmd;

import net.kano.joscar.MiscTools;
import net.kano.joscar.snaccmd.CapabilityBlock;
import net.kano.joscar.snaccmd.icbm.RecvRvIcbm;

import java.io.OutputStream;
import java.io.IOException;

/**
 * A base class for "acceptance" rendezvous commands, or commands with no RV
 * data and a status code of {@link #RVSTATUS_ACCEPT}.
 */
public abstract class AbstractAcceptRvCmd extends AbstractRvCmd {
    /**
     * Creates a new RV "accept" command from the given incoming acceptance RV
     * ICBM.
     *
     * @param icbm an incoming "acceptance" RV ICBM
     */
    protected AbstractAcceptRvCmd(RecvRvIcbm icbm) {
        super(icbm);
    }

    /**
     * Creates a new outgoing RV "accept" command with the given associated
     * capability block.
     *
     * @param cap the capability block associated with this RV command
     */
    protected AbstractAcceptRvCmd(CapabilityBlock cap) {
        super(RVSTATUS_ACCEPT, cap);
    }

    protected final void writeHeaderRvTlvs(OutputStream out) { }

    /**
     * Provides a default implementation for writing this command's RV TLV's.
     * This implementation does not write any TLV's to the given stream (as most
     * acceptance RV commands contain no TLV's).
     *
     * @param out the stream to which to write
     *
     * @throws IOException if an I/O error occurs
     */
    protected void writeRvTlvs(OutputStream out) throws IOException { }

    public String toString() {
        return MiscTools.getClassName(this);
    }
}