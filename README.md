AIM:What is BroadcastReceiver? Difference between Service and BroadcastReceiver. Create an Alarm application by using service & BroadcastReceiver by following below instructions.

Create MainActivity according to below UI design.

Create AlarmBroadcastReceiver class

Create AlarmService Class

Add android.permission.SCHEDULE_EXACT_ALARM Permission in Manifest file

ANS: ->Broadcast Receivers allow us to register for the system and application events, and when that event happens, then the register receivers get notified.

Different: -> Service can continue running in the background, whereas a Broadcast Receiver should finish quickly (e.g. if it is running for more than 5 seconds it may be killed by the OS). The Broadcast Receiver can still run in the background (when app is closed) under certain circumstances.

Output:
![image](https://github.com/pmsolanki23/MAD_Practical-8_21012011142/assets/139521191/20183832-ce60-4e2a-a281-1b3cdcb9f722)
![image](https://github.com/pmsolanki23/MAD_Practical-8_21012011142/assets/139521191/466e8e91-069a-42fb-b0e1-2cbfe421b7c1)
![image](https://github.com/pmsolanki23/MAD_Practical-8_21012011142/assets/139521191/18c2e43f-3476-4e08-9709-04d2a070a8b3)

