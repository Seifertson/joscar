/*
 *  Copyright (c) 2004, The Joust Project
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
 *  File created by keith @ Feb 5, 2004
 *
 */

package net.kano.joustsim.app.forms.prefs;

import net.kano.joustsim.app.GuiResources;
import net.kano.joustsim.oscar.AppSession;
import net.kano.joustsim.Screenname;
import net.kano.joustsim.app.config.CantBeAddedException;
import net.kano.joustsim.trust.CertificateTrustManager;

import javax.swing.ImageIcon;

public class SignersPrefsPanel extends CertificatesPrefsPanel {
    private final ImageIcon mediumSignerIcon = GuiResources.getMediumSignerIcon();
    private final ImageIcon smallSignerIcon = GuiResources.getTinySignerIcon();

    public SignersPrefsPanel(AppSession appSession, net.kano.joustsim.Screenname sn,
            CertificateTrustManager certTrustMgr) {
        super(appSession, sn, certTrustMgr);
    }

    protected ImageIcon getMediumCertificateIcon() {
        return mediumSignerIcon;
    }

    protected String getImportFailedDetails(Exception e, String tryAgainText) {
        if (e instanceof CantBeAddedException) {
            return "The file does not contain the certificate of "
                    + "a Certificate Authority. Only Certificate Authorities' "
                    + "certificates can authenticate buddies' personal "
                    + "certificates. To import a buddy's certificate, "
                    + "import it in the Trusted Personal Certificates section.";
        } else {
            return super.getImportFailedDetails(e, tryAgainText);
        }
    }
}
