//=========================================
//Author: 洪金敏
//Create Date: 2019/02/19 13:51:36
//Description: 
//=========================================

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

namespace cn.jonny.android.plugin
{
    public class AndroidLifeCycle : MonoBehaviour
    {
        public void ChangeLifeCycleState(string state)
        {
            print(state);
            switch (state)
            {
                case "onCreate":
                    break;
                case "onPause":
                    break;
                case "onResume":
                    break;
                case "onBackPressed":
                    break;
                case "onDestroy":
                    break;
            }
        }
    }
}