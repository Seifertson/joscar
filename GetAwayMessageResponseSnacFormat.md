  * SnacCommand family 0x0002, 0x0006
    * AsciiStringBlock: `screenname`
    * UnsignedShort: `warningLevel`
    * TlvChain
      * TlvBlock: type 0x0001
        * UnsignedShort: `userClass`
      * TlvBlock: type 0x000f
        * UnsignedInt: `sessionLength`
      * TlvBlock: type 0x0003
        * UnixDate: `onlineSince`
      * TlvBlock: type 0x0003
        * AsciiString: `awayMsgEncoding`
      * TlvBlock: type 0x0004
        * AsciiString: `awayMessage`