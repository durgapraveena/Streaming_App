package com.pedro.rtmp.rtmp.message.command

import com.pedro.rtmp.rtmp.message.MessageType

/**
 * Created by pedro on 21/04/21.
 */
class CommandAmf3(name: String = "", transactionId: Int = 0, streamId: Int = 0): Command(name, transactionId, streamId) {
  override fun getType(): MessageType = MessageType.COMMAND_AMF3
}