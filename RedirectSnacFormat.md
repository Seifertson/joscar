  * SnacCommand family 0x0001, subtype 0x0005, flag 0x8000
    * Prepended Data
      * UnsignedShort: `length`
      * TlvChain
        * TlvBlock type 0x0001
          * UnsignedShort: `snacFamilyVersion`
    * Data
      * TlvChain
        * TlvBlock type 0x000d
          * UnsignedShort: `serviceId`
        * TlvBlock type 0x0005
          * AsciiString: `serverString`
        * TlvBlock type 0x0006
          * ByteBlock: `authorizationCookie`