package e.josephmolina.risingtimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import e.josephmolina.risingtimer.Util.NotificationUtil
import e.josephmolina.risingtimer.Util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
