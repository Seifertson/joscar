  * TlvChain
    * TlvBlock type 0x0005
      * UnsignedShort: message type (0 - request, 1 - cancel, 2 - accept)
      * `id` is an 8-byte value identifying the ICBM.
      * 'guid' is a COM CLSID.
      * TlvBlock type 0x0003 `internal ip`
      * TlvBlock type 0x0005 `listening port`
      * TlvBlock type 0x000A `unknown`
      * TlvBlock type 0x000B `unknown`
      * TlvBlock type 0x000F `unknown`
      * TlvBlock type 0x2711 `extention data`
      * TlvBlock type 0x0003 `request an ack from server`